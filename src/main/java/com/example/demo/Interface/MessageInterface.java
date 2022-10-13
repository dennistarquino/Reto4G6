/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Interface;
import com.example.demo.Modelo.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Dennis Tarquino
 */
public interface MessageInterface  extends CrudRepository <Message, Integer> {
 
    
}
