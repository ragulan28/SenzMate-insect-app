package com.ragul.insect.payload;


public class UploadFileResponse {
    private String fileName;
    private String insectName;
    private String description;
    private String fileDownloadUri;
    private String fileType;
    private long size;

    public UploadFileResponse(String fileName, String insectName, String description, String fileDownloadUri, String fileType, long size) {
        this.fileName = fileName;
        this.insectName = insectName;
        this.description = description;
        this.fileDownloadUri = fileDownloadUri;
        this.fileType = fileType;
        this.size = size;
    }

//    public UploadFileResponse(String fileName, String fileDownloadUri, String fileType, long size) {
//        this.fileName = fileName;
//        this.fileDownloadUri = fileDownloadUri;
//        this.fileType = fileType;
//        this.size = size;
//    }
//
//    public UploadFileResponse(String insectName, String description, String fileDownloadUri) {
//        this.insectName = insectName;
//        this.description = description;
//        this.fileDownloadUri = fileDownloadUri;
//    }

    public String getInsectName() {
        return insectName;
    }

    public void setInsectName(String insectName) {
        this.insectName = insectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileDownloadUri() {
        return fileDownloadUri;
    }

    public void setFileDownloadUri(String fileDownloadUri) {
        this.fileDownloadUri = fileDownloadUri;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
