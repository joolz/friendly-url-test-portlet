package nl.ou.test;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class MyBean implements Serializable {
	private static final long serialVersionUID = 42L;
	private static final Log LOG = LogFactoryUtil.getLog(MyBean.class);

	@PostConstruct
	private void init() {
		LOG.debug("Postconstruct called");
	}

}
