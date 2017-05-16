/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.csys.parametrage.repository;

import com.csys.parametrage.domain.TypeContacte;
import java.util.Collection;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Administrateur
 */

@SuppressWarnings("unused")
public interface TypeContacteRepository extends  JpaRepository<TypeContacte, Integer>{
    
    List<TypeContacte> findByActifIn( Collection<Boolean> actif);
    
}