/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.redflix.RetflixApp.repositorios;

import com.redflix.RetflixApp.entidades.Director;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Goar
 */
@Repository
public interface RepositorioDirector extends JpaRepository<Director, Integer>{
    
}
