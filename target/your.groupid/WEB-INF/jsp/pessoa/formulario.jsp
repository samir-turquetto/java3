<%@ include file="../../header.jsp" %> 
<div class="container">
    <c:choose>
        <c:when test="${not empty pessoa.id}">
            <h1><a href="/samir-project/">Samir Project</a> - Alterar pessoa: ${pessoa.nome}</h1>
        </c:when>
        <c:otherwise>
            <h1><a href="/samir-project/">Samir Project</a> - Adicionar pessoa</h1>
        </c:otherwise>
    </c:choose>

    <c:choose>
        <c:when test="${not empty pessoa.id}">
            <form action="alterar" method="post">
            </c:when>
            <c:otherwise>
                <form action="adicionar" method="post">
                </c:otherwise>
            </c:choose>
            <input type="hidden" name="pessoa.id" value="${pessoa.id}" />
            Nome: <input class="form-control" type="text" name="pessoa.nome" value="${pessoa.nome}"> 
            <br />
            <c:choose>
                <c:when test="${not empty pessoa.id}">
                    <input class="btn btn-primary" type="submit" value="Alterar">
                </c:when>
                <c:otherwise>
                    <input class="btn btn-primary" type="submit" value="Cadastrar">
                </c:otherwise>
            </c:choose>
        </form>
        <br />
        <c:choose>
            <c:when test="${not empty adicionado}">
                <div class="alert alert-success">${adicionado}</div>
            </c:when>

            <c:when test="${not empty alterado}">
                <div class="alert alert-success"> ${alterado}</div>
            </c:when>
        </c:choose>
        <a href="<c:url value='/pessoa/lista'/>"> Listar pessoas </a>
</div>
<%@ include file="../../footer.jsp" %> 