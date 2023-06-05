package com.midterm.foodSNS.freerecipe.mapper;

import java.util.List;
import java.util.Map;

import com.midterm.foodSNS.command.MfreeboardVO;

public interface IFreeRecipeMapper {

	//개인레시피등록
	void uploadRecipe(MfreeboardVO vo);

	//레시피 상세보기
	MfreeboardVO getRecipe(int bno);

	//레시피 목록보기
	List<MfreeboardVO> getRecipeList(String userId);

	//레시피 삭제
	void delete(int bno);

	//레시피 수정
	void update(Map<String, Object> map);
}