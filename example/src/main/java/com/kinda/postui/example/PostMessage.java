package com.kinda.postui.example;

public class PostMessage {
    private boolean isImage, isMine;
    private String content;

    PostMessage(String message, boolean mine, boolean image) {
        content = message;
        isMine = mine;
        isImage = image;
    }

    String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    boolean isMine() {
        return isMine;
    }

    public void setIsMine(boolean isMine) {
        this.isMine = isMine;
    }

    boolean isImage() {
        return isImage;
    }

    public void setIsImage(boolean isImage) {
        this.isImage = isImage;
    }
}
