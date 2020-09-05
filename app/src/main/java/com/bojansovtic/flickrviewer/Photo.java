package com.bojansovtic.flickrviewer;

import java.io.Serializable;

class Photo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String title;
    private String author;
    private String authorId;
    private String link;
    private String tags;
    private String image;

    public Photo(String title, String author, String authorId, String link, String tags, String image) {
        this.title = title;
        this.author = author;
        this.authorId = authorId;
        this.link = link;
        this.tags = tags;
        this.image = image;
    }

    String getTitle() {
        return title;
    }

    String getAuthor() {
        return author;
    }

    String getAuthorId() {
        return authorId;
    }

    String getLink() {
        return link;
    }

    String getTags() {
        return tags;
    }

    String getImage() {
        return image;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "mTitle='" + title + '\'' +
                ", mAuthor='" + author + '\'' +
                ", mAuthorId='" + authorId + '\'' +
                ", mLink='" + link + '\'' +
                ", mTags='" + tags + '\'' +
                ", mImage='" + image + '\'' +
                '}';
    }
}
