/*(C) 2007-2012 Alibaba Group Holding Limited.	

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SetBooleanHandler implements ParameterHandler {
	public void setParameter(PreparedStatement stmt, Object[] args)
			throws SQLException {
		stmt.setBoolean((Integer) args[0], (Boolean) args[1]);
	}
}