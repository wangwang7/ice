package com.ice.server.service;

import com.ice.common.dto.IceTransferDto;
import com.ice.common.model.IceShowConf;
import com.ice.common.model.IceShowNode;
import com.ice.server.dao.model.IceBase;
import com.ice.server.dao.model.IceConf;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author zjn
 */
public interface IceServerService {

    IceTransferDto getInitConfig(Integer app);

    IceConf getActiveConfById(Integer app, Long confId);

    List<IceConf> getMixConfListByIds(Integer app, Set<Long> confSet);

    IceConf getMixConfById(Integer app, Long confId);

    IceShowNode getConfMixById(Integer app, Long confId);

    IceBase getActiveBaseById(Integer app, Long iceId);

    Map<String, Integer> getLeafClassMap(Integer app, Byte type);

    void addLeafClass(Integer app, Byte type, String clazz);

    void removeLeafClass(Integer app, Byte type, String clazz);

    void updateByEdit();

    boolean haveCircle(Long nodeId, Long linkId);

    boolean haveCircle(Long nodeId, List<Long> linkIds);

    void link(Long nodeId, Long linkId);

    void link(Long nodeId, List<Long> linkIds);

    void unlink(Long nodeId, Long linkId);

    void exchangeLink(Long nodeId, Long originId, Long exchangeId);
}
