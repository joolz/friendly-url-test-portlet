# Test with friendly URL

h:links seem to not function when friendlyURLs are present. To test:

- build the portlet with the friendly-url entries in liferay-portlet.xml commented out. h:link navigation works (from view.xhtml to target.xhtml and back)
- uncomment the friendly-url entries in liferay-portlet.xml. h:link navigation is broken
