package com.umg.redsocialx;

import com.umg.redsocialx.controladores.UsuariosJpaController;
import com.umg.redsocialx.modelos.Usuarios;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class loginBean {

    private String username;
//    private int id;
    private String password;
    private String email;
    private Date fechaNacimiento;
    private String login;
//    private Usuarios usuarios;

//    @PostConstruct
//    public void init() {
//        try {
////            Usuarios usuarios = new Usuarios();
////            usuarios.setNombre("Milton");
////            usuarios.setCorreo("joetd2003@gmail.com");
////            usuarios.setContraseña("123456789");
////            // Convertir la fecha de nacimiento de String a Date
////            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
////            Date fechaNacimiento = dateFormat.parse("27/04/2003");
////            usuarios.setFechadeNacimiento(fechaNacimiento);
//
//            username = "Milton";
//            email = "joetd2003@gmail.com";
//            password = "123456789";
//            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//            Date fechaNacimiento2 = dateFormat.parse("27/04/2003");
//            fechaNacimiento = fechaNacimiento2;
//
//            Usuarios usuarios = new Usuarios(null, username, email, password, fechaNacimiento);
//
//            UsuariosJpaController usuariosjpa = new UsuariosJpaController();
//            try {
//                usuariosjpa.create(usuarios);
//            } catch (Exception ex) {
//                Logger.getLogger(loginBean.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } catch (ParseException ex) {
//            Logger.getLogger(loginBean.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
    // Getters and setters for new fields
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Methods for account creation
    public String createAccount() {
        try {
            Usuarios usuarios = new Usuarios(null, username, email, password, fechaNacimiento);

            UsuariosJpaController usuariosjpa = new UsuariosJpaController();

            usuariosjpa.create(usuarios);
        } catch (Exception ex) {
            Logger.getLogger(loginBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "accountCreated"; // You can define a new navigation rule for this outcome in faces-config.xml
    }

    // Method for logging in
    public String login() {
        // Check if the username and password are correct
        if (username.equals("Milton") && password.equals("password")) {
            return "success";
        } else {
            return "failure";
        }
    }

    // Method to check if the user is logged in
    public boolean isLoggedIn() {
        return username != null && !username.isEmpty();
    }

    // Getters and setters for existing fields (username and password)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
    
    
    
}
