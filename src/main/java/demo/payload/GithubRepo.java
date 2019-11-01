package demo.payload;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by rajeevkumarsingh on 12/11/17.
 */

public class GithubRepo {
    private Long id;

    private String name;

    @JsonProperty("html_url")
    private String htmlUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }


}
