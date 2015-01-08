
/*
***************************************************************************
	실시간으로 폼 체크를 할 수 있는 코드입니다. 
	
	express 모듈이 4.x 대로 올라가면서
	socket.id 모듈  0.x -> 1.x버젼으로 올라가면서 
	함수 사용법이 많이 바뀌었습니다.
	
	express 모듈의 경우 3.4.7 기준으로 작성되었음을 알려드립니다.
***************************************************************************
*/


/*
	http 모듈 불러오기
	mysql 모듈 불러오기
	express 모듈 불러오기
	fs 모듈 불러오기
*/

var http = require('http');
var mysql = require('mysql');
var express = require('express');
var fs = require('fs');

//mysql모듈로 mysql접속 커넥션 생성
var client = mysql.createConnection({
    user: 'root',
    password: '1111',
    database: 'basebook'
});

//express 사용준비
var app = express();

// '/'경로로 접속했을때 test.html 파일을 읽어 그 내용을 클라이언트에 뿌려준다.
app.get('/', function (request, response) {
    fs.readFile('test.html', function (error, data) {
        response.send(data.toString());
    });
});

// '/id'경로로 접속했을때 아까 만든 디비 접속 db-client 객체로 디비 쿼리 조회후 로직 수행.
// 조회 결과에따라 yes no를 클라이언트에 던져 줌.
app.get('/id', function (request, response) {
    client.query('SELECT pid FROM idtable WHERE pid=?', [request.param('id')], function (error, result) {

    	console.log(result);
    	
    	if(result.length){
    		console.log('아이디 있음ㅠㅠ');	
    		response.send({
    			"result":"no"
    		});
    	}else{
    		console.log('아이디 없음!!!!!');
    		response.send({
    			"result":"yes"
    		});
    	}
    });
});



//완성된 소스에 문제가 있는데 클라이언트로부터 request가 6번 이상 오게되면
//서버에서 무시해버리는 현상 발생. 무한 request 방지를 위한거 같음.
//우리는 실시간으로 단어가 올때마다 체크해야하기 때문에 6번은 너무 적고 
//그 제한횟수를 풀어줄 필요가 있는데 그걸 푸는 코드가 아래의 코드라고 구글 형님이 알랴줌.
http.globalAgent.maxSockets = 100;


//서버 생성
http.createServer(app).listen(52273, function () {
    console.log('server running at http://127.0.0.1:52273');
});
