package egovframework.let.temp.service.impl;

import java.util.List;

import egovframework.let.temp.service.TempVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;
import egovframework.rte.psl.dataaccess.util.EgovMap;

//mapper는 인터페이스로 연걸

@Mapper("temp2Mapper") //egovefrmaework로 import.
public interface Temp2Mapper {
	
TempVO selectTemp(TempVO vo) throws Exception;
//DAO에서 가져온 이유는 impl이란 패키지??????????????????????????????????


//임시 데이터 목록 가져오기
List<EgovMap> selectTempList(TempVO vo) throws Exception;

//임시데이터 등록하기
void insertTemp(TempVO vo) throws Exception;

//임시데이터 수정하기
void updateTemp(TempVO vo) throws Exception;

//임시데이터 삭제하기
void deleteTemp(TempVO vo) throws Exception;

}
