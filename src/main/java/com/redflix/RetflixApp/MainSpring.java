/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redflix.RetflixApp;

import com.redflix.RetflixApp.entidades.Director;
import com.redflix.RetflixApp.repositorios.RepositorioDirector;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author Goar
 */
@Component
public class MainSpring implements CommandLineRunner {
    @Autowired
    RepositorioDirector repositorioDirector;
    @Override
    public void run(String... args) throws Exception {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println(repositorioDirector.count());
        Optional<Director> directorConsulta = repositorioDirector.findById(101);
        if (directorConsulta.isPresent()){
            Director d = (Director)directorConsulta.get();
            System.out.println(d.getDir_nombre());
        }else{
            System.out.println("No existe un director con ese código");
        }
        
    }
    
}
