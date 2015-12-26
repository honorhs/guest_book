<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<link href="<c:url value="/resources/css/common.css" />" rel="stylesheet">
	<script src="<c:url value="/resources/js/jquery-2.1.4.min.js" />"></script>
	<script src="<c:url value="/resources/js/common.js" />"></script>
    <title>NHN BASECAMP</title>
</head>
<body>
<div id="header">
</div>
<div id="box"> 
	<section>
		<c:forEach var="guest_books" items="${GB}">
		<div class="lists">
			<h2 class="email_addr">${guest_books.email} <p class="time_stamp">2015-12-11 06:03:25</p></h2>
			<div class="context">
				<p>${guest_books.context}</p>
			</div>
		</div>
		</c:forEach>
	</section>
</div>
<div id="icon">
</div>
<div id="mask">
	<p class="mask_title">GUEST BOOK</p>
</div>
<div id="select">
	<div id="select_box">
	    <section>
	        <article>
	            <h1>List</h1>
	        </article>
	        <article>
	            <h2 id="modify">List</h2>
	        </article>
	    </section>
	    <section>
	        <article>
	            <h1>Write</h1>
	        </article>
	        <article>
	            <h2 id="write">Write</h2>
	        </article>
	    </section>
	</div>
</div>
<div class='container'>
  <div id='f_write'>
     <form action='/app/write' name="f_write">
       <input name='Email' type='text' placeholder='Email'  />
       <input name='Password' type='text' placeholder='Password'  />
       <input type='text' placeholder='Confirm Password'  />
       <input name='Context' type='text' id="w_context" placeholder='Context'  />
       <input type='submit' value="Submit" placeholder='SUBMIT' />
     </form>
  </div>
</div>
<div class='container2'>
  <div id='f_modify'>
     <form action='/app/m_list' name="f_list">
       <input name='Email' type='text' placeholder='Email'  />
       <input name='Password' type='text' placeholder='Password'  />
       <input type='submit' value="Submit" placeholder='SUBMIT' />
     </form>
  </div>
</div>
<div id="search">
	<form method="get" action="/search" id="search">
	  <input name="q" type="text" size="40" placeholder="Search..." />
	</form>
</div>
<div id="footer">
	<p>&copy; 2015 NHN Entertainment Basecamp 사전 과제. All rights reserved.</p>
</div>
</body>
</html>