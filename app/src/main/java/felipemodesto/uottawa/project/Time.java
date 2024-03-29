package felipemodesto.uottawa.project;

public class Time {
    private String weekday;
    private String starthour;
    private String startminute;
    private String endhour;
    private String endminute;
    private String id;
    private String publicid;
    Time(String id,String weekday,String starthour,String startminute,String endhour,String endminute,String publicid){
        this.weekday=weekday;
        this.endhour=endhour;
        this.starthour=starthour;
        this.endminute=endminute;
        this.startminute=startminute;
        this.publicid=publicid;
    }

    public Time() {

    }

    public String getId() {
        return id;
    }

    public String getPublicid() {
        return publicid;
    }

    public void setPublicid(String publicid) {
        this.publicid = publicid;
    }

    public String getEndhour() {
        return endhour;
    }

    public String getEndminute() {
        return endminute;
    }

    public String getStarthour() {
        return starthour;
    }

    public String getStartminute() {
        return startminute;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setEndhour(String endhour) {
        this.endhour = endhour;
    }

    public void setEndminute(String endminute) {
        this.endminute = endminute;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setStarthour(String starthour) {
        this.starthour = starthour;
    }

    public void setStartminute(String startminute) {
        this.startminute = startminute;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }
    public boolean timeavilable(){
        //int checkhourstart=Integer.valueOf(this.starthour).intValue();
        //int checkhourend=Integer.valueOf(this.endhour).intValue();
        int checkhourstart=intvalue(this.starthour);
        int checkhourend=intvalue(this.endhour);
        if(checkhourend<checkhourstart){
            return false;
        }
        else if(checkhourend==checkhourstart){
            //int checkminstart=Integer.valueOf(this.startminute).intValue();
            //int checkminend=Integer.valueOf(this.endminute).intValue();
            int checkminstart=intvalue(this.startminute);
            int checkminend=intvalue(this.endminute);
            return checkminend >checkminstart;
        }else{
            return  true;
        }

    }
    
    public static int intvalue(String a){
        int res;
        res = Integer.valueOf(a).intValue();
        return res;
    }
}
