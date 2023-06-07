package com.levio.javalab.interviewmanager.linebusiness.service.impl;

import com.levio.javalab.interviewmanager.lang.service.impl.DefaultCrudServiceImpl;
import com.levio.javalab.interviewmanager.linebusiness.dto.LineBusinessDTO;
import com.levio.javalab.interviewmanager.linebusiness.entity.LineBusiness;
import com.levio.javalab.interviewmanager.linebusiness.mapper.LineBusinessMapper;
import com.levio.javalab.interviewmanager.linebusiness.repository.LineBusinessRepository;
import com.levio.javalab.interviewmanager.linebusiness.service.LineBusinessService;
import org.springframework.stereotype.Service;

@Service
public class DefaultLineBusinessService extends DefaultCrudServiceImpl<LineBusinessRepository, LineBusinessMapper, Long, LineBusinessDTO, LineBusiness> implements LineBusinessService {
    public DefaultLineBusinessService(LineBusinessRepository repository, LineBusinessMapper mapper){
        super(repository, mapper);
    }
}
