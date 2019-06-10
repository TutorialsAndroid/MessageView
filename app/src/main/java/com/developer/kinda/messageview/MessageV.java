package com.developer.kinda.messageview;

public class MessageV {
    private boolean isImage, isMine;
    private String content;

    MessageV(String message, boolean mine, boolean image) {
        content = message;
        isMine = mine;
        isImage = image;
    }

    String getContent() {
        return content;
    }

    boolean isMine() {
        return isMine;
    }

    boolean isImage() {
        return isImage;
    }

    public void setIsImage(boolean isImage) {
        this.isImage = isImage;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setIsMine(boolean isMine) {
        this.isMine = isMine;
    }
}
