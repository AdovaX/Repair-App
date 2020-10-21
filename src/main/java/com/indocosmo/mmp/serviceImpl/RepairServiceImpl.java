package com.indocosmo.mmp.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indocosmo.mmp.model.Repairs;
import com.indocosmo.mmp.repository.RepairRepository;
import com.indocosmo.mmp.service.RepairService;

@Service
@Transactional
public class RepairServiceImpl implements RepairService{
	
	@Autowired
	private RepairRepository repairRepository;
	

	@Override
	public void repairRequest(Repairs repair) {
		repairRepository.save(repair);
		
		
	}
	
 
	
}
