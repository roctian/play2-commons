package com.sip365.paginate;

public class Paginator {

	public static int start(int pageCount, int pageIndex, int pagesDisplayed) {
		int start, pd_half = pagesDisplayed / 2;
		int upper_limit = pageCount - pagesDisplayed;

		start = pageIndex > pd_half ? pageIndex - pd_half : 0;

		start = upper_limit > start ? start : upper_limit;

		start = start > 0 ? start : 0;
		return start + 1;
	}

	public static int end(int pageCount, int pageIndex, int pagesDisplayed) {
		int end, pd_half = pagesDisplayed / 2;
		if (pageIndex > pd_half) {
			end = pageIndex + pd_half > pageCount ? pageCount : pageIndex
					+ pd_half;
		} else {
			end = pagesDisplayed > pageCount ? pageCount : pagesDisplayed;
		}

		end = end > 0 ? end : 0;
		return end;
	}

	public static void main(String[] args) {
		System.out.println(start(4, 2, 5));
		System.out.println(end(4, 2, 5));
	}

}
