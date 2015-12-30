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
		<div>
			<div class="lists">
				<h2 class="email_addr">${guest_books.email}</h2>
<<<<<<< HEAD:src/main/webapp/WEB-INF/views/GB/guest_book.jsp
				<p class="time_stamp">2015-12-11 06:03:25</p>
=======
				<p class="time_stamp">${guest_books.time_stamp}</p>
>>>>>>> develop:src/main/webapp/WEB-INF/views/GB/guest_book.jsp
				<div class="context">
					<p>${guest_books.context}</p>
				</div>
			</div>
			<div class="custom_box">
				<p class="c_box">수정</p>
				<p class="c_box2">삭제</p>
				<input type="hidden" id="idx_num" value="<c:out value="${ guest_books.id }"/>"/>
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
<div id="dialog-overlay"><p id='message'>${message}</p></div>


<div class='container'>
  <div id='f_write'>
     <form name="f_write">
       <input id="Email" name='Email' type='text' required="required" placeholder='Email' />
       <input id="Password" name='Password' type='text' required="required" placeholder='Password'  />
<<<<<<< HEAD:src/main/webapp/WEB-INF/views/GB/guest_book.jsp
       <input type='text' required="required" placeholder='Confirm Password'  />
=======
       <input type='text' name='Password2' required="required" placeholder='Confirm Password'  />
>>>>>>> develop:src/main/webapp/WEB-INF/views/GB/guest_book.jsp
       <input id="Context" name='Context' type='text' id="w_context" required="required" placeholder='Context'  />
       <input id="id" name='id' type='hidden'>
       <input type='button' id="btnValidate" value="Submit" />
     </form>
  </div>
</div>
<div class='container2'>
  <div id='f_modify'>
     <form name="f_list">
       <input id="Email2" name='Email' type='text' required="required" placeholder='Email'  />
       <input id="Password2" name='Password' type='text' required="required" placeholder='Password'  />
       <input id="id2" name='id' type='hidden'/>
       <input type='button' id="btnValidate2" value="Submit" />
     </form>
  </div>
</div>
<div id="search">
<<<<<<< HEAD:src/main/webapp/WEB-INF/views/GB/guest_book.jsp
	<form method="get" action="/search" id="search">
	  <input name="q" type="text" size="40" placeholder="Search..." />
=======
	<form id="search" name="search3">
	  <input name="search" id="search2" type="text" size="40" placeholder="Search..." />
>>>>>>> develop:src/main/webapp/WEB-INF/views/GB/guest_book.jsp
	</form>
</div>
<div id="footer">
	<p>&copy; 2015 NHN Entertainment Basecamp 사전 과제. All rights reserved.</p>
</div>
</body>
</html>