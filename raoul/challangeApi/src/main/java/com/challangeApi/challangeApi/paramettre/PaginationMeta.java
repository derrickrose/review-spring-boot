package com.challangeApi.challangeApi.paramettre;

public class PaginationMeta {

   private int currentPage;
    private int currentPageSize;
    private int totalPages;
    private int totalRecords;

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getCurrentPageSize() {
        return currentPageSize;
    }

    public void setCurrentPageSize(int currentPageSize) {
        this.currentPageSize = currentPageSize;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(int totalRecords) {
        this.totalRecords = totalRecords;
    }
}
