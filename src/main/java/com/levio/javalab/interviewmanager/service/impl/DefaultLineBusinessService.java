package com.levio.javalab.interviewmanager.service.impl;

import com.levio.javalab.interviewmanager.lang.service.impl.DefaultCrudServiceImpl;
import com.levio.javalab.interviewmanager.dto.LineBusinessDTO;
import com.levio.javalab.interviewmanager.entity.LineBusiness;
import com.levio.javalab.interviewmanager.mapper.LineBusinessMapper;
import com.levio.javalab.interviewmanager.repository.LineBusinessRepository;
import com.levio.javalab.interviewmanager.service.LineBusinessService;
import org.springframework.stereotype.Service;

@Service
public class DefaultLineBusinessService extends DefaultCrudServiceImpl<LineBusinessRepository, LineBusinessMapper, Long, LineBusinessDTO, LineBusiness> implements LineBusinessService {
    public DefaultLineBusinessService(LineBusinessRepository repository, LineBusinessMapper mapper){
        super(repository, mapper);
    }
}
