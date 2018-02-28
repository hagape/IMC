package com.example.logonrm.imc.extensions

/**
 * Created by logonrm on 27/02/2018.
 */
fun Double.format(digitis:Int) = java.lang.String.format("%.${digitis}f",this)