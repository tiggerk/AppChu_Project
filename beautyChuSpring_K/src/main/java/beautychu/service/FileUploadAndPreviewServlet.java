package beautychu.service;

import java.io.BufferedInputStream;

import java.io.BufferedOutputStream;
 
import java.io.IOException;
 
import java.io.InputStream;
 
import java.util.List;
 
 
 
import javax.servlet.ServletException;
 
import javax.servlet.http.HttpServlet;
 
import javax.servlet.http.HttpServletRequest;
 
import javax.servlet.http.HttpServletResponse;
 
 
 
import org.apache.commons.codec.binary.Base64InputStream;
 
import org.apache.commons.fileupload.FileItem;
 
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
 
import org.apache.commons.fileupload.servlet.ServletFileUpload;
 
import org.apache.commons.logging.Log;
 
import org.apache.commons.logging.LogFactory;
 
 
 
public class FileUploadAndPreviewServlet extends HttpServlet {
 
    private static final long serialVersionUID = 1113234491492549318L;
 
    /**
 
     * Servlet Post
 
     */
 
    @Override
 
    @SuppressWarnings("unchecked")
 
    public void doPost(HttpServletRequest request, HttpServletResponse response)
 
            throws ServletException, IOException {
 
 
 
        DiskFileItemFactory factory      = null;
 
        ServletFileUpload   upload       = null;
 
        List<FileItem>      listFileItem = null;
 
 
 
        FileItem fileItem = null;
 
 
 
        InputStream      fis = null;
 
        BufferedInputStream  bis = null;
 
        BufferedOutputStream bos = null;
 
 
 
        try {
 
            request.setCharacterEncoding("UTF-8");
 
            factory = new DiskFileItemFactory();
 
 
 
            // Set factory constraints
 
            //1메가가 넘지 않으면 메모리에서 바로 사용
 
            factory.setSizeThreshold(1024 * 1024 * 1);
 
 
 
            // Create a new file upload handler
 
            upload = new ServletFileUpload(factory);
 
 
 
            // Set overall request size constraint
 
            // 파일  업로드  최대  size : 무한
 
            upload.setSizeMax(-1);
 
 
 
            //실제 업로드 부분(이부분에서 파일이 생성된다)
 
            listFileItem = upload.parseRequest(request);
 
 
 
            for (int i = 0, ii = listFileItem.size(); i < ii; i++) {
 
                fileItem = listFileItem.get(i);
 
 
 
                if ("FileInput".equals(fileItem.getFieldName())) {
 
 
 
                    Base64InputStream in = new Base64InputStream(fileItem.getInputStream(), true);
 
                    bis  = new BufferedInputStream(in);
 
                    bos  = new BufferedOutputStream(response.getOutputStream());
 
 
 
                    byte[] buffer = new byte[4096];
 
 
 
                    int read = 0;
 
                    // bis.read(buffer): 파일에서 4KB씩 읽어서 buffer에 저장
 
                    // 파일의 끝이면 -1
 
                    while ((read = bis.read(buffer)) != -1) {
 
                        bos.write(buffer, 0, read);
 
                    }
 
                    bos.flush();
 
                }
 
            }
 
        } catch (Exception e) {
 
            e.printStackTrace();
 
 
 
            throw new ServletException(e);
 
        } finally {
 
            listFileItem = null;
 
            fileItem     = null;
 
            fis.close();
 
            bis.close();
 
            bos.close();
 
        }
 
    }
 
 
 
    /**
 
     * Servlet Get
 
     */
 
    @Override
 
    public void doGet(HttpServletRequest request, HttpServletResponse response)
 
            throws ServletException, IOException {
 
        doPost(request, response);
 
    }
 
}