package com.challangeApi.challangeApi.paramettre;

public class ProductParameter {

  private int page;
  private int limit;
  private int description_length;
  private String query_string;
  private String all_words;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getDescription_length() {
        return description_length;
    }

    public void setDescription_length(int description_length) {
        this.description_length = description_length;
    }

    public String getQuery_string() {
        return query_string;
    }

    public void setQuery_string(String query_string) {
        this.query_string = query_string;
    }

    public String getAll_words() {
        return all_words;
    }

    public void setAll_words(String all_words) {
        this.all_words = all_words;
    }
}
