package it.pccube.migration.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import it.mef.persistence.dao.AdesioneDao;
import it.mef.persistence.dizionari.dao.DizTipoCassaDao;
import it.mef.persistence.dizionari.entity.FatTDizTipoCassa;
//import it.mef.persistence.entity.FatTAdesione;

@Service
@Transactional 
public class ProcedureService {
	
	@Autowired
	private DizTipoCassaDao dao;
//	@Autowired
//	private SessionFactory sessionFactory;
	
	
	public String test(){
		int count = dao.getAllTipoCassa().size();
		System.out.println("--------------"+count+"--------");
		FatTDizTipoCassa o = dao.findByPrimaryKey(FatTDizTipoCassa.class, 1L);
//		o.setCdCodice("TC02");
//		dao.update(o);
		FatTDizTipoCassa newE = new FatTDizTipoCassa();
		newE.setCdCodice("xxx");
		newE.setIdDizTipoCassa(2l);
		dao.save(newE);
		return "#####"+o.getCdCodice()+"######";
	}

}
