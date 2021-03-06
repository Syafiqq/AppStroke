package id.ac.ub.filkom.sekcv.appstroke.model.db.entity;

import org.joda.time.LocalDate;

/**
 * This <AppStroke> project in package <id.ac.ub.filkom.sekcv.appstroke.model.db.entity> created by :
 * Name         : syafiq
 * Date / Time  : 29 August 2016, 11:38 AM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class Entity_User
{
    private final int       id;
    private final LocalDate birthDate;
    private       String    name;
    private       String    email;
    private       String    password;

    public Entity_User(int id, LocalDate birthDate, String name, String email, String password)
    {
        this.id = id;
        this.birthDate = birthDate;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }
}
