package owl2vowl.knowledgebase.util;


public class QueryString {

	/**
	 * 分页条件
	 */
	private int pageSize;	// 每页显示多少记录

	private int currentPage;	// 当前第几页数据

	/**
	 * 查询条件
	 */
	private String ready01;

	private String ready02;

	private String ready03;

	private String ready04;

	private String ready05;

	private String ready06;

	private String ready07;

	private String ready08;

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public String getReady01() {
		return ready01;
	}

	public void setReady01(String ready01) {
		this.ready01 = ready01;
	}

	public String getReady02() {
		return ready02;
	}

	public void setReady02(String ready02) {
		this.ready02 = ready02;
	}

	public String getReady03() {
		return ready03;
	}

	public void setReady03(String ready03) {
		this.ready03 = ready03;
	}

	public String getReady04() {
		return ready04;
	}

	public void setReady04(String ready04) {
		this.ready04 = ready04;
	}

	public String getReady05() {
		return ready05;
	}

	public void setReady05(String ready05) {
		this.ready05 = ready05;
	}

	public String getReady06() {
		return ready06;
	}

	public void setReady06(String ready06) {
		this.ready06 = ready06;
	}

	public String getReady07() {
		return ready07;
	}

	public void setReady07(String ready07) {
		this.ready07 = ready07;
	}

	public String getReady08() {
		return ready08;
	}

	public void setReady08(String ready08) {
		this.ready08 = ready08;
	}

	@Override
	public String toString() {
		return "QueryString{" +
				"pageSize=" + pageSize +
				", currentPage=" + currentPage +
				", ready01='" + ready01 + '\'' +
				", ready02='" + ready02 + '\'' +
				", ready03='" + ready03 + '\'' +
				", ready04='" + ready04 + '\'' +
				", ready05='" + ready05 + '\'' +
				", ready06='" + ready06 + '\'' +
				", ready07='" + ready07 + '\'' +
				", ready08='" + ready08 + '\'' +
				'}';
	}
}
