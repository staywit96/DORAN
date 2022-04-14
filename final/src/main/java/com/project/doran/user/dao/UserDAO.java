package com.project.doran.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.project.doran.group.vo.GroupVO;
import com.project.doran.search.vo.CriteriaVO;
import com.project.doran.search.vo.PagingVO;
import com.project.doran.user.vo.UserVO;

@Mapper
@Repository("userDAO")
public interface UserDAO {

	// 검색
	public List<UserVO> getSearchList(CriteriaVO searchVO) throws Exception;

	// 전체 게시글 수
	public int getSearchListCnt(CriteriaVO searchVO) throws Exception;

	// paging(페이지)
	public List<UserVO> getSearchList(PagingVO pagingVO) throws Exception;

	/* 로그인 */
	public UserVO userLogin(UserVO userVO) throws Exception;

	/* 회원가입 */
	public void userJoin(UserVO userVO) throws Exception;

	/* 아이디 중복 검사 */
	public int idCheck(String uid) throws Exception;

	/* 닉네임 중복 검사 */
	public int nickCheck(String nickname) throws Exception;

	/* 회원 정보 수정 */
	public void userUpdate(UserVO userVO) throws Exception;
	
	/* 가입한 그룹 목록 */
	public List<GroupVO> userGroupList(String uid) throws Exception;
	
	/* 관심 주제 설정 */
	public void userCategoryMapping(UserVO userVO) throws Exception;
	
	/* 관심 주제 삭제 */
	public void userCategoryDelete(String uid) throws Exception;
	
	/* 관심 주제 가져오기 */
	public UserVO userCategoryList(String uid) throws Exception;
	
	
}
