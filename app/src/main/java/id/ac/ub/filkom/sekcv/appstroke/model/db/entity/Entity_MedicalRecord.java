package id.ac.ub.filkom.sekcv.appstroke.model.db.entity;

import org.joda.time.DateTime;

import com.github.syafiqq.ptvpso.svm.stroke.dataset.Stroke;
import com.github.syafiqq.ptvpso.svm.stroke.dataset.StrokeMetadata;
import com.github.syafiqq.ptvpso.svm.stroke.dataset.StrokeParameter;

/**
 * This <AppStroke> project in package <id.ac.ub.filkom.sekcv.appstroke.model.db.entity> created by :
 * Name         : syafiq
 * Date / Time  : 29 August 2016, 11:39 AM.
 * Email        : syafiq.rezpector@gmail.com
 * Github       : syafiqq
 */
public class Entity_MedicalRecord
{
    private final int      id;
    private final int      user;
    private final int      age;
    private final DateTime time;
    protected     double   cholesterol;
    protected     double   hdl;
    protected     double   ldl;
    protected     double   triglyceride;
    private       int      status;

    public Entity_MedicalRecord(int user, int age, double cholesterol, double hdl, double ldl, double triglyceride, int status, DateTime time)
    {
        this(-1, user, age, cholesterol, hdl, ldl, triglyceride, status, time);
    }

    public static Stroke newInstanceFromMedicalRecord(final Entity_MedicalRecord record)
    {
        return new Stroke(
                new StrokeParameter(
                        record.getAge(),
                        record.getCholesterol(),
                        record.getHdl(),
                        record.getLdl(),
                        record.getTriglyceride()
                ),
                new StrokeMetadata(
                        record.getStatus()
                )
        );
    }

    public Entity_MedicalRecord(int id, int user, int age, double cholesterol, double hdl, double ldl, double triglyceride, int status, DateTime time)
    {
        this.id = id;
        this.user = user;
        this.age = age;
        this.time = time;
        this.cholesterol = cholesterol;
        this.hdl = hdl;
        this.ldl = ldl;
        this.triglyceride = triglyceride;
        this.status = status;
    }

    public int getId()
    {
        return id;
    }

    public int getUser()
    {
        return user;
    }

    public int getAge()
    {
        return age;
    }

    public DateTime getTime()
    {
        return time;
    }

    public double getCholesterol()
    {
        return cholesterol;
    }

    public void setCholesterol(double cholesterol)
    {
        this.cholesterol = cholesterol;
    }

    public double getHdl()
    {
        return hdl;
    }

    public void setHdl(double hdl)
    {
        this.hdl = hdl;
    }

    public double getLdl()
    {
        return ldl;
    }

    public void setLdl(double ldl)
    {
        this.ldl = ldl;
    }

    public double getTriglyceride()
    {
        return triglyceride;
    }

    public void setTriglyceride(double triglyceride)
    {
        this.triglyceride = triglyceride;
    }

    public int getStatus()
    {
        return status;
    }

    public void setStatus(int status)
    {
        this.status = status;
    }
}
