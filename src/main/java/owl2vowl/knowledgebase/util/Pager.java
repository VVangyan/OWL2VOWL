package owl2vowl.knowledgebase.util;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Pager<T> implements Serializable {
	
	private static final long serialVersionUID = -897382280206952825L;

	private int pageSize;// 每页显示多少记录
	
	private int currentPage;// 当前第几页数据

	private int totalRecord;// 一共多少条记录

	private int totalPage;// 一共多少页录

	private List<T> dataList;// 显示的数据

//	private Map<String,Object> map; //返回多个list
	
	public Pager(int pageNum,int pageSize,List<T> sourceList){
		if(sourceList == null){
			return;
		}
		//总记录条数
		this.totalRecord=sourceList.size();
		
		//每页显示多少条记录	
		this.pageSize=pageSize;
		
		//获取总页数
		this.totalPage=this.totalRecord / this.pageSize;
		if(this.totalRecord % this.pageSize !=0){
			this.totalPage = this.totalPage + 1;
		}
		//当前第几页数据
		this.currentPage = this.totalPage < pageNum ? this.totalPage : pageNum;

		//起始索引
		int fromIndex=this.pageSize*(this.currentPage-1);
		
		//结束索引
		//如果传入的当前页号码乘以每页多少条记录比总的记录条数大那么结束页码就为总的记录
		int toIndex=this.pageSize*this.currentPage>this.totalRecord ?this.totalRecord:this.pageSize*this.currentPage;

		this.dataList=sourceList.subList(fromIndex, toIndex);
		
	}
	
	public Pager() {
		super();
	}

	public Pager(int pageSize, int currentPage, int totalRecord, int totalPage,
			List<T> dataList) {
		super();
		this.pageSize = pageSize;
		this.currentPage = currentPage;
		this.totalRecord = totalRecord;
		this.totalPage = totalPage;
		this.dataList = dataList;
	}

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

	public int getTotalRecord() {
		return totalRecord;
	}

	public void setTotalRecord(int totalRecord) {
		this.totalRecord = totalRecord;
	}

	public int getTotalPage() {
		return totalPage;
	}
	

	@Override
	public String toString() {
		return "Pager [pageSize=" + pageSize + ", currentPage=" + currentPage
				+ ", totalRecord=" + totalRecord + ", totalPage=" + totalPage
				+ ", dataList=" + dataList + "]";
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}
}
