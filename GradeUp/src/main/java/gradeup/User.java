/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gradeup;

/**
 *
 * @author Nilesh
 */
public class User {
    private int id,clas,dob,mobno,max,obtain;
    private String name;
    
    public User(int id, String name, int clas, int dob, int mobno,int max, int obtain){
        this.id=id;
        this.name=name;
        this.clas=clas;
        this.dob=dob;
        this.mobno=mobno;
        this.max=max;
        this.obtain=obtain;
    }
    
    public int getid(){
            return id;
        }
    public int getclas(){
            return clas;
        }
    public int getdob(){
            return dob;
        }
    public int getmobno(){
            return mobno;
        }
    public String getname(){
            return name;
        }
    public int getmax(){
            return max;
        }
    public int getobtain(){
            return obtain;
        }
}
