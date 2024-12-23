package com.xworkz.Employee.servlet;//import javax.servlet.ServletContext;




import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet("/getImage")
public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String imagePath ="C:\\Users\\lavan\\OneDrive\\Pictures\\IMG_20240706_110216_optimized_250.jpg";


        File imageFile = new File(imagePath);
        FileInputStream fileInputStream = new FileInputStream(imageFile);
        byte[] imageData = new byte[(int) imageFile.length()];
        fileInputStream.read(imageData);
        fileInputStream.close();


        response.setContentType("image/jpeg");


        OutputStream outputStream = response.getOutputStream();
        outputStream.write(imageData);
        outputStream.close();
    }
}
