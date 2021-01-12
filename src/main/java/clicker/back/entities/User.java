package clicker.back.entities;

import javax.persistence.*;

@Entity
@Table(name = "\"user\"")
public class User {

    @Id
    @Column(unique = true,length = 100)
    String email;

    @Column(length = 100)
    String password;

    @Column(length = 1000)
    String name;

    @Column
    Boolean permitido;

    @Column
    Boolean admin;

    @Column
    Boolean superuser;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getPermitido() {
        return permitido;
    }

    public void setPermitido(Boolean permitido) {
        this.permitido = permitido;
    }

    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public Boolean getSuperuser() {
        return superuser;
    }

    public void setSuperuser(Boolean superuser) {
        this.superuser = superuser;
    }
}
