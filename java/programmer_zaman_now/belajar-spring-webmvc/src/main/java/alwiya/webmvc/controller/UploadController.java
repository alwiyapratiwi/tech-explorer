package alwiya.webmvc.controller;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {

    @PostMapping(path = "/upload/profile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    @ResponseBody
    public String upload(
        @RequestParam(name = "name") String name,
        @RequestPart(name = "profile") MultipartFile profile
    ) throws IOException {
        // Path uploadDir = Paths.get("upload");
        // Path path = uploadDir.resolve(profile.getOriginalFilename());
        Path path = Path.of("upload/" + profile.getOriginalFilename());
        profile.transferTo(path);
        return "Success save profile " + name + " to " + path;
    }
    
}
