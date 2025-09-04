package vn.iotstar.Controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/image")
public class ImageServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Đường dẫn thư mục chứa ảnh
    private static final String UPLOAD_DIR = "F:/HK1_25_26/LTWEB/uploads/";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Lấy tên file từ request (fname)
        String fname = req.getParameter("fname");
        if (fname == null || fname.trim().isEmpty()) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "File name is missing!");
            
            return;
        }

        File file = new File(UPLOAD_DIR + fname);
        if (!file.exists()) {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND, "File not found!");
            
            return;
        }

        // Đặt content type dựa theo đuôi file
        if (fname.endsWith(".jpg") || fname.endsWith(".jpeg")) {
            resp.setContentType("image/jpeg");
        } else if (fname.endsWith(".png")) {
            resp.setContentType("image/png");
        } else if (fname.endsWith(".gif")) {
            resp.setContentType("image/gif");
        } else {
            resp.setContentType("application/octet-stream");
        }

        // Gửi ảnh về client
        try (FileInputStream fis = new FileInputStream(file);
             OutputStream os = resp.getOutputStream()) {
        	
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
        }
        System.out.println("Request image: " + fname);
        System.out.println("Path: " + file.getAbsolutePath());

    }
}

