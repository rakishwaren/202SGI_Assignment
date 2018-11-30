package com.example.rakeshwaran.androidnearbyplaces.Model;

import android.support.annotation.NonNull;

public class PlaceDetail {
    private Result result;

    private String[] html_attributions;

    private String status;

    public Result getResult ()
    {
        return result;
    }

    public void setResult (Result result)
    {
        this.result = result;
    }

    public String[] getHtml_attributions ()
    {
        return html_attributions;
    }

    public void setHtml_attributions (String[] html_attributions)
    {
        this.html_attributions = html_attributions;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }


    @Override
    public String toString()
    {
        return "Class [result = "+result+", html_attributions = "+html_attributions+", status = "+status+"]";
    }
}
