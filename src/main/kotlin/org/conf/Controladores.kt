package org.conf

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

/**
 * Created by blanc on 16/04/2017.
 */

@RestController
class TemarioController(){
    @RequestMapping(value="/prueba",method= arrayOf(RequestMethod.GET))
    fun getPrueba():String{
        return "Hola caracola";
    }
}