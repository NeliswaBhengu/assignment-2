
package com.za.ac.Neliswa;

/**
 *
 * @author Neliswa Bhengu
 */
/*
Class Computer to stroe information about computer
*/
class Computer
{
//Member function to store IPAddress and value
String IPAddress;
float Value;
//Parametrized constructor
public Computer(String ip,float value )
{
this.IPAddress=ip;
this.Value=value;
}
@Override
public String toString()
{
String s= this.IPAddress+" $"+this.Value+"\n";
return s;
}
}
