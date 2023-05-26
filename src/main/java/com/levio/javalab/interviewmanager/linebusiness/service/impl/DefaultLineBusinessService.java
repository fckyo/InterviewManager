package com.levio.javalab.interviewmanager.linebusiness.service.impl;

import com.levio.javalab.interviewmanager.lang.service.impl.DefaultCrudServiceImpl;
import com.levio.javalab.interviewmanager.linebusiness.dto.LineBusinessDTO;
import com.levio.javalab.interviewmanager.linebusiness.entity.LineBusiness;
import com.levio.javalab.interviewmanager.linebusiness.mapper.LineBusinessMapper;
import com.levio.javalab.interviewmanager.linebusiness.repository.LineBusinessRepository;
import com.levio.javalab.interviewmanager.linebusiness.service.LineBusinessService;
import org.springframework.stereotype.Service;

@Service

//Todo : choisis si tu mets le suffixe Impl ou pas dans tes différentes implémentations
public class DefaultLineBusinessService extends DefaultCrudServiceImpl<LineBusiness, LineBusinessRepository, LineBusinessMapper, Long, LineBusinessDTO> implements LineBusinessService {
    //Todo : utilisation du constructeur du DefaultCrudServiceImpl
    public DefaultLineBusinessService(LineBusinessRepository repository, LineBusinessMapper mapper){
        super(repository, mapper);
    }
}
