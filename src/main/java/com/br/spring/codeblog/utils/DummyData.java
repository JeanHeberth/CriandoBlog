package com.br.spring.codeblog.utils;

import com.br.spring.codeblog.model.Post;
import com.br.spring.codeblog.repository.CodeblogRepository;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class DummyData {

    @Autowired
    CodeblogRepository codeblogRepository;

    //@PostConstruct
    public void savePosts() {
        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Jean Heberth Souza Vieira");
        post1.setData(LocalDate.now());
        post1.setTitulo("Spring com Michelli");
        post1.setTexto("Estou aprendendo spring boot com as videos aulas da Michelli Brito");


        Post post2 = new Post();
        post2.setAutor("Jessica Jasmine de  Souza Vieira");
        post2.setData(LocalDate.now());
        post2.setTitulo("Testes de Software");
        post2.setTexto("Estou aprendendo testes de software com as videos aulas da Lele");

        postList.add(post1);
        postList.add(post2);

        for (Post post : postList) {
            Post postSaved = codeblogRepository.save(post);
            System.out.println(postSaved.getId());
        }


    }

}
