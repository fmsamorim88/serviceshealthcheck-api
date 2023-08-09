package com.fmsamorim.servicesheathcheck.models;
import com.fmsamorim.servicesheathcheck.Util.Description;

public enum EnumStatusService{
    @Description("up")
    UP,
    @Description("error")
    ERROR,
     @Description("warning")
    WARNING
}
