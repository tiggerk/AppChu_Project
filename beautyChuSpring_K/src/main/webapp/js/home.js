/*
 * Author: Chees
 * Description: Home관련 기본 js
 */

var SHORT_TIME = 1;
var LONG_TIME  = 5000;
var HomeApp = {
	init: function() {
		var startDelay = (window.intro == 'no') ? SHORT_TIME : LONG_TIME ;
		if ( !$.browser.mobile ) {
			var loading = $('<div class="loading"></div>').appendTo('body');

			if ( startDelay == SHORT_TIME ) {
				loading.hide();
			}
			window.onload = function () {
				if ( $('body').hasClass('started') ) return;
				$('body').addClass('started');
				loading.fadeOut(1000, function(){
					loading.remove();
					HomeApp.showIntro();
				});
			}

			// 로딩이 startDelayms보다 길어지면 강제로 시작
			setTimeout(function(){
				if ( $('body').hasClass('started') ) return;
				$('body').addClass('started');
				loading.fadeOut(1000, function(){
					loading.remove();
					HomeApp.showIntro();
				});
			},startDelay);
		} else {
			$('.wrapper').css('display','block');
			ShowWindow.play();
		}

		/* 안쓰는거임 메인 밑에 버튼 동작안하는거.
		   $(window).on('scroll', function(){
			if ( $('.motion-scroll').hasClass('stopped')) return;
			if ( parseInt($(window).scrollTop()) > 10 ) {
				$('.motion-scroll').addClass('stopped');
				stopMotion($('.motion-scroll'));
				console.log('motion-scroll stopped');
			}
		}); */
	},

	showIntro : function() {
		
		$('html,body').css({'overflow':'hidden', 'height':'auto'});
	    $('.wrapper').show(0).slideUp(0).slideDown(2000, 'easeOutQuad');
	    $('#content').css({'min-height':1000, 'background':'#fff'});
	    $('#header').slideUp(0).delay(200).slideDown(600, 'easeInOutQuint');

	    $('#content .show-window > .bg').slideUp(0);
	    $('#content .show-window > h2').css({'opacity':0});
	    $('#content .show-window > .grid-by-slider').hide();
	    $('#content .show-window .btns').hide();
	    
	    
	    $('#content .show-window').slideUp(0).delay(200).slideDown(500, 'easeInOutQuint', function(){
	    	$('#content .show-window > h2').slideUp(0).delay(300).slideDown(500, 'easeInOutQuint');
	    	HomeApp.checkShowWindowStart();
	        $(window).on('scroll resize', HomeApp.checkShowWindowStart);
	      });


	    $('#content .best-shop-wrap').slideUp(0).delay(1400).slideDown(600, 'easeInOutQuint', function(){
	      $('html,body').css({'overflow':'auto', 'height':'auto'});
	      $('#header').scrollToFixed();
	      $('html, body').trigger('scroll');

	    });
	    
		$('#footer').slideUp(0).delay(2000).slideDown(600, 'easeInOutQuint');
	},

	checkShowWindowStart : function() {
		if ( $('#content .show-window').hasClass('activated')) return false;
		var top = parseInt($('.show-window').offset().top);
		var scrollTop = $(window).scrollTop();
		var visibleArea = $(window).height() + scrollTop;
		if ( visibleArea > top + 50 ) {
			$('#content .show-window').addClass('activated');
			$('#content .show-window .btns').stop().fadeIn(500);
			$('#content .show-window > .bg').stop().slideDown(1500, 'easeInQuad');
			$('#content .show-window > h2').css({'margin-top':30, 'opacity':0}).stop().animate({'margin-top':0, 'opacity':1}, 600, 'easeOutQuad', function(){

			});
			ShowWindow.play();
		}
	}

};

$(function(){

	if ( $('body').hasClass('home') == false ) return false;

	HomeApp.init();
	$(window).trigger('resize');

});