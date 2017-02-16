package com.didikee.hweather.bean;

/**
 * Created by didik on 2017/2/16.
 */

public class DailyForecastBean {
    /**
     * astro : {"mr":"23:12","ms":"09:56","sr":"07:05","ss":"17:51"}
     * cond : {"code_d":"404","code_n":"100","txt_d":"雨夹雪","txt_n":"晴"}
     * date : 2017-02-16
     * hum : 38
     * pcpn : 0.6
     * pop : 13
     * pres : 1023
     * tmp : {"max":"10","min":"-3"}
     * uv : 2
     * vis : 9
     * wind : {"deg":"26","dir":"无持续风向","sc":"微风","spd":"2"}
     */

    private AstroBean astro;
    private CondBean cond;
    private String date;
    private String hum;
    private String pcpn;
    private String pop;
    private String pres;
    private TmpBean tmp;
    private String uv;
    private String vis;
    private WindBean wind;

    public AstroBean getAstro() {
        return astro;
    }

    public void setAstro(AstroBean astro) {
        this.astro = astro;
    }

    public CondBean getCond() {
        return cond;
    }

    public void setCond(CondBean cond) {
        this.cond = cond;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getPcpn() {
        return pcpn;
    }

    public void setPcpn(String pcpn) {
        this.pcpn = pcpn;
    }

    public String getPop() {
        return pop;
    }

    public void setPop(String pop) {
        this.pop = pop;
    }

    public String getPres() {
        return pres;
    }

    public void setPres(String pres) {
        this.pres = pres;
    }

    public TmpBean getTmp() {
        return tmp;
    }

    public void setTmp(TmpBean tmp) {
        this.tmp = tmp;
    }

    public String getUv() {
        return uv;
    }

    public void setUv(String uv) {
        this.uv = uv;
    }

    public String getVis() {
        return vis;
    }

    public void setVis(String vis) {
        this.vis = vis;
    }

    public WindBean getWind() {
        return wind;
    }

    public void setWind(WindBean wind) {
        this.wind = wind;
    }
}
