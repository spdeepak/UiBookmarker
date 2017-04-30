package com.deepaksp.uibookmarker.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * @author Deepak
 *
 */
@Entity
public class Link {

    @Id
    @GeneratedValue
    private long id;

    @Version
    private int version;

    private String url;

    @Temporal(TemporalType.TIMESTAMP)
    private Date addedDate;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "link")
    private LinkHeadProperties linkHeadProperties;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Folder> folders = new ArrayList();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Topic> topics = new ArrayList();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public LinkHeadProperties getLinkHeadProperties() {
        return linkHeadProperties;
    }

    public void setLinkHeadProperties(LinkHeadProperties linkHeadProperties) {
        this.linkHeadProperties = linkHeadProperties;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

}
