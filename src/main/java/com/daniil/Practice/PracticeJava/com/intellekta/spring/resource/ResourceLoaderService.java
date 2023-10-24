package com.daniil.Practice.PracticeJava.com.intellekta.spring.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import java.io.*;

@Component("resourceLoaderService")
public class ResourceLoaderService implements ResourceLoaderAware {

    @Autowired
    private ResourceLoader resourceLoader;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }


    public void showResourceDataUsingFilePath() {
        try {
            Resource resource = resourceLoader.getResource("users.txt");
            File file = resource.getFile();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String st;
            if (file.canRead()) {
                while ((st = bufferedReader.readLine()) != null) {
                    System.out.println(st);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
}
