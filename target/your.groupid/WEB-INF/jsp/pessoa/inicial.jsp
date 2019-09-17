<%@include file="../../header.jsp" %>

<div class="container mt-5">    
    <div class="row">
        <div class="col-sm-6">
            <div class="card mt-5">
                <div class="card-body">
                    <h5 class="card-title">Listagem de Funcion�rios</h5>
                    <p class="card-text">Uma lista de todos os funcion�rios cadastrados.</p>
                    <a href="pessoa/lista" class="btn btn-info">Listar Funcion�rios</a>
                </div>
            </div>
        </div>
        <div class="col-sm-6">
            <div class="card mt-5">
                <div class="card-body">
                    <h5 class="card-title">Adicionar um novo Funcion�rio</h5>
                    <p class="card-text">Cadastro de Funcion�rio, para poder manupula-lo</p>
                    <a href="pessoa/formulario" class="btn btn-success">Adicionar Funcion�rio</a>
                </div>
            </div>
        </div>
    </div>
</div>

<%@include file="../../footer.jsp" %>
