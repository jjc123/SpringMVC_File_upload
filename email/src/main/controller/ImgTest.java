package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class ImgTest {

    @RequestMapping("toUploadPage")
    public String toUploadImg(){
        return "/Img";
    }
    @RequestMapping("uploadImg")
    public String uploadImg(Model model,@RequestParam("file") MultipartFile file) throws IOException {
        String oldName = file.getOriginalFilename();
        String newName = null;
        if(file!=null&&oldName!=null&&oldName.length()>0){
            String pic_path = "D:\\emailNew\\";
            newName = String.valueOf(UUID.randomUUID())+oldName.substring(oldName.lastIndexOf("."));
            File newFile = new File(pic_path+newName);
            file.transferTo(newFile);
        }
        System.out.println(newName);
        model.addAttribute("image",newName);
        return "/Img";
    }
}
