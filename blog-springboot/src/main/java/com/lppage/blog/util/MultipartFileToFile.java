package com.lppage.blog.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.*;

/**
 * @Author: jack-苏
 * @Date 2022−04−11   11:11 下午
 * @ClassName: MultipartFileToFile
 * @Description:
 * @Version 1.0
 */


public class MultipartFileToFile {

    public static File multipartFileToFile(MultipartFile file) {
        File toFile = null;
        try {
            if (file.equals("") || file.getSize() <= 0) {
                file = null;
            } else {
                InputStream ins = null;
                ins = file.getInputStream();
                toFile = new File(file.getOriginalFilename());
                inputStreamToFile(ins, toFile);
                ins.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return toFile;

    }


    private static void inputStreamToFile(InputStream ins, File file) {
        try {
            OutputStream os = new FileOutputStream(file);
            int bytesRead = 0;
            byte[] buffer = new byte[8192];
            while ((bytesRead = ins.read(buffer, 0, 8192)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.close();
            ins.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
