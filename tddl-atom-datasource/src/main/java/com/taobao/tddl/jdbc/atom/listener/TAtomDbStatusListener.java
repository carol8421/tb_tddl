/*(C) 2007-2012 Alibaba Group Holding Limited.	

import com.taobao.tddl.jdbc.atom.config.object.AtomDbStatusEnum;

/**���ݿ�״̬�仯������
 * 
 * @author qihao
 *
 */
public interface TAtomDbStatusListener {

	void handleData(AtomDbStatusEnum oldStatus, AtomDbStatusEnum newStatus);
}