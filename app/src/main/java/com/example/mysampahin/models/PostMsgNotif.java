package com.example.mysampahin.models;

import com.google.gson.annotations.SerializedName;

public class PostMsgNotif {
    @SerializedName("msisdn")
    private String noHp;
    @SerializedName("content")
    private String content;

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
